import java.util.List;
public abstract class MazeSolver {
private Maze maze;
private boolean isSolved, isSolvable;
public MazeSolver(Maze maze) {
this.maze = maze;
isSolved = false;
isSolvable = true;
};
abstract void makeEmpty();
abstract boolean isEmpty();
abstract void add(Square s);
abstract Square next();
public boolean isSolved(){
return isSolved;
};
public void step() {
if(isEmpty()) {
System.out.println("You did it!");
isSolvable = false;
return;
}
Square currSq = next();
List<Square> neighbors = maze.getNeighbors(currSq);
for(int x = 0; x < neighbors.size(); x++) {
if(neighbors.get(x).getType() == 0) {
currSq = neighbors.get(x);
}
else if(neighbors.get(x).getType() == 1) {
neighbors.remove(x);
}
}
};
public String getPath() {
if(isSolved)
return "Solved! You did it!";
else if(!isSolvable) {
return "Sorry! Find another maze!";
}
else {
return "Keep solving!";
}
};
void solve() {
while(!isSolved) {
step();
}
};
}
