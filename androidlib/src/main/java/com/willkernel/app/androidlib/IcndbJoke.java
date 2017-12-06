package com.willkernel.app.androidlib;

/**
 * Created by willkernel on 2017/12/6.
 */

public class IcndbJoke {

    /**
     * type : success
     * value : {"id":268,"joke":"Time waits for no man. Unless that man is Chuck Norris."}
     */

    private String type;
    private ValueBean value;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ValueBean getValue() {
        return value;
    }

    public void setValue(ValueBean value) {
        this.value = value;
    }

    public static class ValueBean {
        /**
         * id : 268
         * joke : Time waits for no man. Unless that man is Chuck Norris.
         */

        private int id;
        private String joke;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getJoke() {
            return joke;
        }

        public void setJoke(String joke) {
            this.joke = joke;
        }
    }
}
