package c322spring2024homework2.model;
public enum Builder {
    FENDER, MARTIN, GIBSON, COLLINGS, OLSON, RYAN, PRS, ANY;
    public String toString() {
        switch(this) {
            case FENDER: return "Fender";
            case MARTIN: return "Martin";
            case GIBSON: return "Gibson";
            case COLLINGS: return "Colling";
            case OLSON: return "Olson";
            case RYAN: return "Ryan";
            case PRS: return "PRS";
            default: return "Unspecified";
        }
    }
}
