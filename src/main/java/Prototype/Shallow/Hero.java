package Prototype.Shallow;

import java.util.UUID;

public  interface Hero extends Cloneable{

    void setID(UUID heroID);
    Hero clone() throws CloneNotSupportedException;
}
