
# Maze Solver

This Maze Solver solves a maze (wow!) by implementing the Stack ADT and creating a 2D array using information from a .txt file. This was completed alongside my Computer Science 3 class. 

## Desription

This Java project is designed to solve mazes using Stacks and ArrayLists. It takes maze information from .txt files, which specify the START position, END position, WALLS, and OPEN spots using whole numbers and constants. The key for the spaces is as follows:

- `EMPTY` (0) represents an open spot.
- `WALL` (1) indicates a wall.
- `START` (2) marks the start position.
- `EXIT` (3) designates the exit or end position.

With this information, we can create a 2D Array that has a X, Y, and Type, for the stacks to interact with. See below for a few examples of a maze.

For example:

### Maze 1
```
3 3
2 0 0
0 0 0
0 0 3
```

In Maze 1, a 2D array with 3 rows and 3 columns is created. The start position is at coordinates (0,0), and the exit position is at (3, 3). The maze is defined using the constants mentioned above. This is one of the easier implementations.

### Maze 2
```
7 13
0 0 0 0 0 0 1 0 0 0 0 0 0
1 1 0 1 1 1 1 1 1 1 0 1 0
0 1 0 0 0 0 0 0 0 0 0 1 0
0 1 0 1 1 0 0 1 1 1 0 1 0
0 0 0 1 0 0 0 0 0 1 0 1 0
0 1 1 1 1 1 0 1 0 1 0 1 0
0 0 0 0 2 0 0 1 0 0 1 3 0
```

In Maze 2, a 2D array with 7 rows and 13 columns is created. The start position is at (7, 4) while the exit is at (7, 12). The stacks will work with multiple pathways until it reaches the final square. 

### Maze 3
```
3 5
0 0 1 0 0
2 0 1 0 3
0 0 1 0 0
```

Maze 3 is special because the middle of the maze is all walls. SO, this maze will not have a solution because there is no path from start to finish. 

### Squares

Each square in the maze includes an x, y, and type attribute. This is important to know because 1) we need to figure out what type of square it is and if it is traversable 2) figure out if the square is inside of the grid.

The process for this is when we check the initial square, we grab its neighbors (North, East, South, and West) and determine their types. If the type is open, then that Square is thrown on a worklist Stack to be used later. If not, then we don't add it to any list and keep moving. The program then recursively repeats this process until each stack is exhausted OR if one of the stack's last Square's type is 3 for EXIT. 


# Screenshots
![Screenshot 1](https://i.ibb.co/wRjTS6g/maze-1.png)
![Screenshot 2](https://i.ibb.co/T4TPKVm/maze-2.png)
![Screenshot 3](https://i.ibb.co/RhTrf0p/maze-3.png)


## Installation

Clone the entire directory from GitHub locally. Import the files as a project in your favorite IDE (I use Eclipse IDE). Once everything is important, navigate to the MazeApp.java and run the main method. You will then be presented with a GUI for the Maze Solver.

- `load` - loads a text file.
- `reset` - reset the stacks.
- `quit` - removes the text file.
- `stack` - clears the stack.
- `start` - runs the step method until the maze is solved.
- `step` - runs the step method once. 
    
## Acknowledgements

 Mr. Bunn and Mrs. Peterson at the CTE Center in Frisco ISD.

