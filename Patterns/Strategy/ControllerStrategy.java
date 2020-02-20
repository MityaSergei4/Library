class ControllerStrategy {
    private Strategy strategy;

    ControllerStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    double getPrice(Double price){
        return strategy.getPrice(price);
    }
}