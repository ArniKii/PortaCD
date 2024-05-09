public class portaCD {
    private int max = 15, n = 0;
    private CD[] album;

    public portaCD(CD[] gigio) {
        album = new CD[max];
        for (int i = 0; i < gigio.length; i++) {
            album[i] = new CD(gigio[i]);
        }
        n = gigio.length;
    }

    public portaCD() {
        album = new CD[max];
    }

    public int setCD(CD damn, int gigio) {
        int s;
        if (gigio < 0 || gigio >= max) {
            s = -1;
        } else {
            if (album[gigio] != null) {
                s = 0;
            } else {
                s = 1;
                n++;
            }
            album[gigio] = new CD(damn);
        }
        return s;
    }

    public CD getCD(int i) {
        CD s = null;
        if (i > 0 && i < max) {
            s = new CD(album[i]);
        }
        return s;
    }

    public int killCD(int i) {
        int s = -1;
        if (i > 0 && i < max) {
            if (album[i] != null) {
                album[i] = null;
                s = i;
                n--;
            } else {
                s = 0;
            }
        }
        return s;
    }

    public int getMax() {
        return max;
    }

    public int getN() {
        return n;
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < max; i++) {
            if (album[i] != null) {
                s += "CD pos: " + i + "\n" + album[i].toString() + "\n";
            }
        }
        return s;
    }

    public int cercaCD(String titolo) {
        int s = -1, i = 0;
        while (i < max && s == -1) {
            if (album[i] != null) {
                if (album[i].getTitolo().equals(titolo)) {
                    s = i;
                }
            }
            i++;
        }
        return s;
    }

    public int cercaCD(CD titolo) {
        int s = -1, i = 0;
        while (i < max && s == -1) {
            if (album[i] != null) {
                if (album[i].equals(titolo)) {
                    s = i;
                }
            }
            i++;
        }
        return s;
    }

    public int confrontaCollezione(portaCD vinil) {
        int comune = 0;
        portaCD gnocchi = new portaCD();
        for (int i = 0; i < max; i++) {
            if (album[i] != null && gnocchi.cercaCD(album[i]) == -1) {
                if (vinil.cercaCD(album[i]) != -1) {
                    comune++;
                    gnocchi.setCD(album[i], i);
                }
            }
        }
        return comune;
    }
}
