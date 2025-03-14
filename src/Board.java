import java.awt.*;

public class Board {
    private OutputWindow a=new OutputWindow();
    private Space[][] x = new Space[8][8];

    public Board() {
        Pawns Pawn1= new Pawns("♟");
        Pawns Pawn2=new Pawns("♟");
        Pawns Pawn3=new Pawns("♟");
        Pawns Pawn4=new Pawns("♟");
        Pawns Pawn5=new Pawns("♟");
        Pawns Pawn6=new Pawns("♟");
        Pawns Pawn7=new Pawns("♟");
        Pawns Pawn8=new Pawns("♟");

        Queen Queen1=new Queen("♛");
        King King1=new King("♚");
        Rook Rook1=new Rook("♜");
        Rook Rook2=new Rook("♜");
        Knight Knight1=new Knight("♞");
        Knight Knight2=new Knight("♞");

        Bishop bishop = new Bishop("♝");
        Bishop bishop2 = new Bishop("♝");
        //first row (black)
        x[0][1]=Rook1;
        x[0][0]=Knight1;
        x[0][2]= bishop;
        x[0][3]=Queen1;
       x[0][4]=King1;
       x[0][5]=bishop2;
        x[0][6]=Knight2;
       x[0][7]= Rook2;

        //2nd row (full of pawns) (black)
           x[1][1]= Pawn1;
           x[1][0]= Pawn2;
           x[1][2]= Pawn3;
           x[1][3]= Pawn4;
           x[1][4]= Pawn5;
           x[1][5]= Pawn6;
           x[1][6]= Pawn7;
           x[1][7]= Pawn8;




           //white section


        Pawns wPawn1= new Pawns("♙");
        Pawns wPawn2=new Pawns("♙");
        Pawns wPawn3=new Pawns("♙");
        Pawns wPawn4=new Pawns("♙");
        Pawns wPawn5=new Pawns("♙");
        Pawns wPawn6=new Pawns("♙");
        Pawns wPawn7=new Pawns("♙");
        Pawns wPawn8=new Pawns("♙");

        Queen wQueen1=new Queen("♕");
        King wKing1=new King("♔");
        Rook wRook1=new Rook("♖");
        Rook wRook2=new Rook("♖");
        Knight wKnight1=new Knight("♘");
        Knight wKnight2=new Knight("♘");

        Bishop wbishop = new Bishop("♗");
        Bishop wbishop2 = new Bishop("♗");
        //first row (white)
        x[7][1]=wRook1;
        x[7][0]=wKnight1;
        x[7][2]= wbishop;
        x[7][3]=wQueen1;
        x[7][4]=wKing1;
        x[7][5]=wbishop2;
        x[7][6]=wKnight2;
        x[7][7]= wRook2;

        //2nd row (full of pawns) (white
        x[6][1]= wPawn1;
        x[6][0]= wPawn2;
        x[6][2]= wPawn3;
        x[6][3]= wPawn4;
        x[6][4]= wPawn5;
        x[6][5]= wPawn6;
        x[6][6]= wPawn7;
        x[6][7]= wPawn8;


    for (int i=0; i<x.length; i++) {
        for (int j=0; j<x[0].length; j++){
            if (x[i][j]==null){
                Space blank1=new Space("    ");
                x[i][j]=blank1;
            }
        }
    }

    }


    public void printBoard()  {
        for (int i=0; i<8; i++) {
            for (int j=0; j<8; j++) {
                a.addTextToWindow(x[i][j].getSymbol(), Color.black);
                if (j<7) {
                a.addTextToWindow("|",Color.black); }

            }

            a.addTextToWindow("\n-----------------------------\n",Color.black);
        }
    }

}
