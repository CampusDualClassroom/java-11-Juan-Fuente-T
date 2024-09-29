package com.campusdual.classroom;

public class TVRemote {
    String color;
    int channel = 1;
    int volume = 1;
    boolean on = false;

    public TVRemote(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void turnOn() {
        this.on = true;
    }

    public void turnOff() {
        this.on = false;
    }

    public void channelUp() {
        this.channel += 1;
    }

    public void channelDown() {
        if (channel > 0) {
            this.channel -= 1;
        }
    }

    public void volumeUp() {
        this.volume += 1;
    }

    public void volumeDown() {
        if (volume > 0) {
            this.volume -= 1;
        }
    }
}

