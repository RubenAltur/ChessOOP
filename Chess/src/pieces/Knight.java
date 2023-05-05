package pieces;

import java.util.ArrayList;

import chess.Cell;

/**
 * This is the Knight Class inherited from the Piece abstract class
 *  
 *
 */
public class Knight extends Piece{
	
	//Constructor
	public Knight(String i,String p,int c)
	{
		setId(i);
		setPath(p);
		setColor(c);
	}
	
	//Move Function overridden
	//There are at max 8 possible moves for a knight at any point of time.
	//Knight moves only 2(1/2) steps
/**
	 * Esta funcio calcula tots els posibles moviments del cavall en una part del tabler
	 * @param state es un array de 2 dimension que representa el estat actual dde les peçes en el tabler, aon cada
	 * element es una posicio que te informacio de la peça que l'ocupa
	 * @param x la coordenada x del cavall
	 * @param y la coordenada x del cavall
	 * @return un arraylist dels possibles moviments del cavall en exe estat del tabler
	 * @version 1.0
	 * @author Ruben Altur
	 * @since 05/05/2023
	 */
	public ArrayList<Cell> move(Cell state[][],int x,int y)
	{
		possiblemoves.clear();
		int posx[]={x+1,x+1,x+2,x+2,x-1,x-1,x-2,x-2};
		int posy[]={y-2,y+2,y-1,y+1,y-2,y+2,y-1,y+1};
		for(int i=0;i<8;i++)
			if((posx[i]>=0&&posx[i]<8&&posy[i]>=0&&posy[i]<8))
				if((state[posx[i]][posy[i]].getpiece()==null||state[posx[i]][posy[i]].getpiece().getcolor()!=this.getcolor()))
				{
					possiblemoves.add(state[posx[i]][posy[i]]);
				}
		return possiblemoves;
	}
}