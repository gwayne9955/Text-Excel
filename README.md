# Text-Excel
A java program designed to mimic Microsoft Excel

##Usage:

###Sum:
Type a cell location followed by an ' = '.
Then in parenthesis type 'sum' followed by the range of cells wishing to be added up.
Ex. a1 = ( sum a2 - b3 )"
    	
    	else if (category.contains("avg")) {
    		answer = "Type a cell location followed by an ' = '\nThen in parenthesis type 'avg' "
    				+ "followed by the range of cells wishing to be averaged up. Ex. a1 = ( avg a2 - b3 )\n";
    	}
    	
    	else if (category.contains("sorta")) {
    		answer = "Type 'sorta' then the ranges wished to be \nsorted in ascending order. Ex. sorta a1 - b4\n";
    	}
    	
    	else if (category.contains("sortd")) {
    		answer = "Type 'sortd' then the ranges wished to be \nsorted in descending order. Ex. sortd a1 - b4\n";
    	}
    	
    	else if (category.contains("formula")) {
    		answer = "Type any cell location followed by a ' = ' then a formula that may \ninclude numbers and cells"
    				+ " inside parenthesis. Ex. a4 = ( 3 * b3 )\n";
    	}
    	
    	else if (category.contains("cell")) {
    		answer = "Type any cell and press enter to view the contents of that cell\n"
    				+ "Type any cell followed by a ' = ' and a value, date, or string to \nassign a value to that cell\n";
    	}
