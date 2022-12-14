
package com.example.rxnetworking.androidnetworking.interfaces;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/**
 * Created by FRabbi on 11/09/22.
 */
public interface Parser<F, T> {

    T convert(F value) throws IOException;

    abstract class Factory {

        public Parser<ResponseBody, ?> responseBodyParser(Type type) {
            return null;
        }

        public Parser<?, RequestBody> requestBodyParser(Type type) {
            return null;
        }

        public Object getObject(String string, Type type) {
            return null;
        }

        public String getString(Object object) {
            return null;
        }

        public HashMap<String, String> getStringMap(Object object) {
            return null;
        }

    }

}