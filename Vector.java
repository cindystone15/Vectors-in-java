
public class Vector
{
    double x;
    double y; 

    Vector(double x, double y){
        this.x = x;
        this.y = y;
    }

    double getX(){
        return x;
    }

    double getY(){
        return y; 

    }

    /* i dont think this is needed yet 
    Vector add(Vector other) 
    {
        double new_x = this.x + other.x;
        double new_y = this.y + other.y;
        return Vector(new_x, new_y);
    }

    Vector subtract(Vector other)
    {
        double new_x = this.x - other.x;
        double new_y = this.y - other.y; 
        return Vector(new_x, new_y);
    }*/ 

    double lengthVect() {
        double rSqred = this.x * this.x + this.y * this.y;
        return Math.sqrt(rSqred);
    }
}