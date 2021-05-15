package cz.czechitas.java2webapps.ukol6.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class NahodneCisloService {

    private final Random random;

    public NahodneCisloService() {
        random = new Random();
    }

    public int dejNahodneCislo(int horniMez) {
        return random.nextInt(horniMez);
    }

}
