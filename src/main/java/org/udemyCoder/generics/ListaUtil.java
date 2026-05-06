package org.udemyCoder.generics;

import java.util.List;

public class ListaUtil {
    private ListaUtil() {
    }

    public static Object getUltimmo(final List<?> lista) {
        return lista.get(lista.size() - 1);
    }

    public static <T> T getUltimo(List<T> lista) {
        return lista.get(lista.size() - 1);
    }
}
