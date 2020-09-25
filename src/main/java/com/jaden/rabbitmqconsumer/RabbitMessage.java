package com.jaden.rabbitmqconsumer;

public class RabbitMessage {
    private int id;
    private String name;
    private boolean isSolo;

    public RabbitMessage() {}

    public RabbitMessage(int id, String name, boolean isSolo) {
        this.id = id;
        this.name = name;
        this.isSolo = isSolo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSolo() {
        return isSolo;
    }

    public void setSolo(boolean solo) {
        isSolo = solo;
    }

    @Override
    public String toString() {
        return "RabbitMessage{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isSolo=" + isSolo +
                '}';
    }
}
