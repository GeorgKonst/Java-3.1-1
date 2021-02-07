package ru.netology.domain;

public class Radio {
    private int radioStationNumber;
    private int soundVolume;
    private int minRadioStationNumber;
    private int maxRadioStationNumber;
    private int minSoundVolume;
    private int maxSoundVolume;

    public int getRadioStationNumber() {
        return radioStationNumber;
    }

    public void setRadioStationNumber(int radioStationNumber) {
        if (radioStationNumber > maxRadioStationNumber){
            return;
        }
        if (radioStationNumber < minRadioStationNumber){
            return;
        }
        this.radioStationNumber = radioStationNumber;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int soundVolume) {
        if (soundVolume > maxSoundVolume){
            return;
        }
        if (soundVolume < minSoundVolume){
            return;
        }
        this.soundVolume = soundVolume;
    }

    public int getMinRadioStationNumber() {
        return minRadioStationNumber;
    }

    public void setMinRadioStationNumber(int minRadioStationNumber) {
        this.minRadioStationNumber = minRadioStationNumber;
    }

    public int getMaxRadioStationNumber() {
        return maxRadioStationNumber;
    }

    public void setMaxRadioStationNumber(int maxRadioStationNumber) {
        this.maxRadioStationNumber = maxRadioStationNumber;
    }

    public int getMinSoundVolume() {
        return minSoundVolume;
    }

    public void setMinSoundVolume(int minSoundVolume) {
        this.minSoundVolume = minSoundVolume;
    }

    public int getMaxSoundVolume() {
        return maxSoundVolume;
    }

    public void setMaxSoundVolume(int maxSoundVolume) {
        this.maxSoundVolume = maxSoundVolume;
    }

    public void nextStation() {
        int nextStation = radioStationNumber + 1;
        if (nextStation > maxRadioStationNumber) {
            this.radioStationNumber = minRadioStationNumber;
        } else
            this.radioStationNumber = nextStation;
    }

    public void prevStation() {
        int prevStation = radioStationNumber - 1;
        if (prevStation < minRadioStationNumber) {
            this.radioStationNumber = maxRadioStationNumber;
        } else
            this.radioStationNumber = prevStation;
    }

    public void soundVolumeDecrease(){
        int soundVolumeDecrease = soundVolume - 1;
        if (soundVolumeDecrease < minSoundVolume){
            this.soundVolume = minSoundVolume;
        } else
            this.soundVolume = soundVolumeDecrease;
    }
    public void soundVolumeIncrease(){
        int soundVolumeIncrease = soundVolume + 1;
        if (soundVolumeIncrease > maxSoundVolume){
            this.soundVolume = maxSoundVolume;
        } else
            this.soundVolume = soundVolumeIncrease;
    }

}

