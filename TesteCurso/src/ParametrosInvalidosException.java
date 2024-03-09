class ParametrosInvalidosException extends Exception {

    public ParametrosInvalidosException(Integer n1, Integer n2) {
        System.out.println("O segundo parâmetro deve ser maior que o primeiro parâmetro");
    }
}