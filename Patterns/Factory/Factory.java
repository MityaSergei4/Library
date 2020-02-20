class Factory {
    Eatable getType(Types type){
        Eatable eat;
        switch (type){
            case CHERRY:
                eat = new Cherry();
                break;
            case CHOCOLATE:
                eat = new Chocolate();
                break;
            case BANANA:
                eat = new Banana();
                break;
            default:
                throw new IllegalArgumentException("Wrong doughnut type:" + type);
        }
        return eat;
    }
}
