package application;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        ChessMatch chessMatch = new ChessMatch();

        while (true) {
            UI.printBoard(chessMatch.pieces());
            System.out.println();
            System.out.print("source: ");
            ChessPosition source = UI.readChessPosition(sc);

            System.out.println();
            System.out.print("Target: ");
            ChessPosition target = UI.readChessPosition(sc);

            ChessPiece capturePiece = chessMatch.performChessMove(source, target);

        }
    }
}
