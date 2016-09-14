package ReusingClasses_1;

import java.util.ArrayList;

/**
 * Created by evanhitchings on 9/14/16.
 */
public class RotatableList<E> extends ArrayList<E> {


    protected void rotateList(int rotations) {
        if(rotations == 0){
            return;
        }
        //NEGATIVE TO ROTATE THE OPPOSITE WAY!
        if(rotations < 0){
            this.add(0, this.get(this.size() - 1));
            this.remove(this.size() -1);
            rotations++;
            //System.out.println(rotations);
            rotateList(rotations);
        //STANDARD ROTATION
        } else{
            this.add(this.get(0));
            this.remove(0);
            rotations--;
            //System.out.println(rotations);
            rotateList(rotations);

        }



    }

}
