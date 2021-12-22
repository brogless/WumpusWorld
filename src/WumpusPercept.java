public class WumpusPercept {
    private boolean stench;
    private boolean breeze;
    private boolean glitter;
    private boolean scream;

    public void setStench() {
        stench = true;
    }

    public void setBreeze() {
        breeze = true;
    }

    public void setGlitter() {
        glitter = true;
    }


    public void setScream() {
        scream = true;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        if (stench)
            result.append("There is Stench. ");
        if (breeze)
            result.append("There is Breeze. ");
        if (glitter)
            result.append("There is Glitter. ");
        if (scream)
            result.append("There is Scream. ");
        return result.toString();
    }
}
