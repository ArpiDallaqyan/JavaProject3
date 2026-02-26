package Homework_25_02_26;

class Rectangle {
    int length;
    int width;

    Rectangle(){

    }
    Rectangle( int l, int w){
        length = l;
        width = w;
    }
    int area(){
        return length * width;
    }

    int perimetr(){
        return 2 * (length + width);
    }
}


