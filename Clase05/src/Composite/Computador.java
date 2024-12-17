package Composite;

public class Computador {

    private Motherboard motherBoard;

    public Computador(){
        //El constructor instancia la motherboard(clase motherboard que contiene los componentes)
        this.motherBoard = new Motherboard();
    }

    public void getMotherBoard(){
        this.motherBoard.getMotherBoardComponents();
    }



}
