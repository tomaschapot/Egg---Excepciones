package service;

public class ComputadoraService {

    public ComputadoraService() {
    }

    public Integer generateRandomNumber() {

        return (int) Math.round(Math.random() * 500);

    }

}
