package ru.twistofthemyth.windriverprototype.context;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ThreadContainer {

    private ThreadContainer() {
        throw new IllegalAccessError();
    }

    private static final Map<Class<?>, ThreadLocal<Object>> THREAD_LOCAL_MAP = new HashMap<>();

    public static <T> void put(Class<T> clazz, Object instance) {
        if (THREAD_LOCAL_MAP.containsKey(clazz)) {
            THREAD_LOCAL_MAP.get(clazz).set(instance);
        } else {
            THREAD_LOCAL_MAP.put(clazz, ThreadLocal.withInitial(() -> instance));
        }
    }

    @SuppressWarnings("unchecked")
    public static <T> Optional<T> get(Class<T> clazz) {
        T instance = null;
        if (THREAD_LOCAL_MAP.containsKey(clazz) &&
                THREAD_LOCAL_MAP.get(clazz) != null &&
                THREAD_LOCAL_MAP.get(clazz).get() != null) {
            try {
                instance = (T) THREAD_LOCAL_MAP.get(clazz).get();
            } catch (ClassCastException e) {
                return Optional.empty();
            }
        }
        return Optional.ofNullable(instance);
    }
}
