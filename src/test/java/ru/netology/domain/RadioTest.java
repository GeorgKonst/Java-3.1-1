package ru.netology.domain;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldCurrentRadioStation(){
        Radio radio = new Radio();
        radio.setMinRadioStationNumber(0);
        radio.setMaxRadioStationNumber(9);
        radio.setRadioStationNumber(8);
        assertEquals(8, radio.getRadioStationNumber());
    }
    @Test
    public void shouldCurrentRadioStationUpperNotValid(){
        Radio radio = new Radio();
        radio.setMinRadioStationNumber(0);
        radio.setMaxRadioStationNumber(9);
        radio.setRadioStationNumber(11);
        assertEquals(0, radio.getRadioStationNumber());
    }
    @Test
    public void shouldCurrentRadioStationLowerNotValid(){
        Radio radio = new Radio();
        radio.setMinRadioStationNumber(0);
        radio.setMaxRadioStationNumber(9);
        radio.setRadioStationNumber(-5);
        assertEquals(0, radio.getRadioStationNumber());
    }

    @Test
    public void shouldNexStation(){
        Radio radio = new Radio();
        radio.setMinRadioStationNumber(0);
        radio.setMaxRadioStationNumber(9);
        radio.setRadioStationNumber(5);
        radio.nextStation();
        assertEquals(6, radio.getRadioStationNumber());
    }
    @Test
    public void shouldNexStationMax(){
        Radio radio = new Radio();
        radio.setMinRadioStationNumber(0);
        radio.setMaxRadioStationNumber(9);
        radio.setRadioStationNumber(9);
        radio.nextStation();
        assertEquals(0, radio.getRadioStationNumber());
    }
    @Test
    public void shouldPrevStation(){
        Radio radio = new Radio();
        radio.setMinRadioStationNumber(0);
        radio.setMaxRadioStationNumber(9);
        radio.setRadioStationNumber(5);
        radio.prevStation();
        assertEquals(4, radio.getRadioStationNumber());
    }
    @Test
    public void shouldPrevStationMin(){
        Radio radio = new Radio();
        radio.setMinRadioStationNumber(0);
        radio.setMaxRadioStationNumber(9);
        radio.setRadioStationNumber(0);
        radio.prevStation();
        assertEquals(9, radio.getRadioStationNumber());
    }
    @Test
    public void shouldCurrentSoundVolume(){
        Radio radio = new Radio();
        radio.setMaxSoundVolume(10);
        radio.setMinSoundVolume(0);
        radio.setSoundVolume(5);
        assertEquals(5, radio.getSoundVolume());
    }
    @Test
    public void shouldCurrentSoundVolumeUpperNotValid(){
        Radio radio = new Radio();
        radio.setMaxSoundVolume(10);
        radio.setMinSoundVolume(0);
        radio.setSoundVolume(11);
        assertEquals(0, radio.getSoundVolume());
    }
    @Test
    public void shouldCurrentSoundVolumeLowerNotValid(){
        Radio radio = new Radio();
        radio.setMaxSoundVolume(10);
        radio.setMinSoundVolume(0);
        radio.setSoundVolume(-1);
        assertEquals(0, radio.getSoundVolume());
    }
    @Test
    public void shouldSoundVolumeDecrease(){
        Radio radio = new Radio();
        radio.setMaxSoundVolume(10);
        radio.setMinSoundVolume(0);
        radio.setSoundVolume(5);
        radio.soundVolumeDecrease();
        assertEquals(4, radio.getSoundVolume());
    }

    @Test
    public void shouldSoundVolumeDecreaseMin(){
        Radio radio = new Radio();
        radio.setMaxSoundVolume(10);
        radio.setMinSoundVolume(0);
        radio.setSoundVolume(0);
        radio.soundVolumeDecrease();
        assertEquals(0, radio.getSoundVolume());
    }
    @Test
    public void shouldSoundVolumeIncrease(){
        Radio radio = new Radio();
        radio.setMaxSoundVolume(10);
        radio.setMinSoundVolume(0);
        radio.setSoundVolume(5);
        radio.soundVolumeIncrease();
        assertEquals(6, radio.getSoundVolume());
    }
    @Test
    public void shouldSoundVolumeIncreaseMax() {
        Radio radio = new Radio();
        radio.setMaxSoundVolume(10);
        radio.setMinSoundVolume(0);
        radio.setSoundVolume(10);
        radio.soundVolumeIncrease();
        assertEquals(10, radio.getSoundVolume());
    }


}