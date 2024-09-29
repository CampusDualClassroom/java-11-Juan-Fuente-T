package com.campusdual.classroom;

public class TVRemote {
    String color;
    int channel = 1;
    int volume = 1;
    boolean on = false;

    public TVRemote(String color) {
        this.color = color;
    }

    /*channelUp
            channelDown
    turnOn
            turnOff
            volumeUp
    volumeDown*/

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isTurnOn() {
        return on;
    }

    public void setTurnOn(boolean turnOn) {
        on = turnOn;
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

