package engine;

public interface ISudokuModel {
	
	/**
	 * adds a single number to a cell to move the board closer to a solved state
	 * 
	 * @param cell Loc of cell to fill
	 * @param number int to fill into cell supplied
	 * @return if the fill operation was sucessfull or not. will return false if the input is invalid
	 */
	public boolean fillCell(Loc cell, int number);
	
	/**
	 * 
	 * @param cell Loc to add hints to
	 * @param hint int to add to the cell provided
	 */
	public void addHint(Loc cell, int hint);

}
