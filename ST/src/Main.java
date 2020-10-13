class Main {
    public static void main(String[] args) {
        SymbolTable symbolTable = new SymbolTable();
        symbolTable.add("divisor");
        symbolTable.add("identifier");
        symbolTable.add("constant");

        System.out.println("------------------------");
        System.out.println("Positions before resizing");
        System.out.println("------------------------");
        System.out.println("divisor is at "+symbolTable.findElement("divisor")+" in ST");
        System.out.println("identifier is at "+symbolTable.findElement("identifier")+" in ST");
        System.out.println("constant is at "+symbolTable.findElement("constant")+" in ST");

        symbolTable.add("someName");
        symbolTable.add("constant123");
        symbolTable.add("integerConstant");
        symbolTable.add("stringConstant");

        System.out.println("------------------------");
        System.out.println("Positions after resizing");
        System.out.println("------------------------");

        System.out.println("divisor is at "+symbolTable.findElement("divisor")+" in ST");
        System.out.println("identifier is at "+symbolTable.findElement("identifier")+" in ST");
        System.out.println("constant is at "+symbolTable.findElement("constant")+" in ST");
        System.out.println("someName is at "+symbolTable.findElement("someName")+" in ST");
        System.out.println("constant123 is at "+symbolTable.findElement("constant123")+" in ST");
        System.out.println("integerConstant is at "+symbolTable.findElement("integerConstant")+" in ST");
        System.out.println("stringConstant is at "+symbolTable.findElement("stringConstant")+" in ST");
    }
}