public class Square
{
//These values are used to denote what type of Square this is in the maze
final static int EMPTY = 0; //an empty space
final static int WALL = 1; //a wall
final static int START = 2; //the start
final static int EXIT = 3; //the exit
//These values indicate the status of a particular Square while the maze is
being solved, for the GUI
final static char WORKING = 'o'; //currently on the work list (the
stack)
final static char EXPLORED = '.'; //done, already explored
final static char ON_EXIT_PATH = 'x'; //on the exit path, used in a later lab
final static char UNKNOWN = '_'; //not known / visited yet (empty cells
only)
private int row, col; //r, c location in the maze
private int type; //type of this square, e.g. empty, wall, etc.
private char status; //the status of a room being explored, shown by the
GUI
public Square(int r, int c, int t) {
row = r;
col = c;
type = t;
status = UNKNOWN;
}
public String toString() {
String answer = "";
if(this.type == 0 ) {
answer += " ";
}
else if(this.type == 1) {
answer += " # ";
}
else if(this.type == 2) {
answer += " S ";
}
else {
answer += " E ";
}
if(this.status == WORKING) {
answer += " O ";
}
else if(this.status == EXPLORED) {
answer += " . ";
}
else if(this.status == ON_EXIT_PATH) {
answer += " x ";
}
else {
answer += " _ ";
}
return answer;
}
public int getRow() {
return row;
}
public int getCol() {
return col;
}
public int getType() {
return type;
}
public char getStatus() {
return status;
}
public void setStatus(char status) {
this.status = status;
}
public void reset() {
this.status = UNKNOWN;
}
public boolean equals(Object obj) {
return ((Square) obj).getRow() == row && ((Square) obj).getCol() ==
col;
}
}