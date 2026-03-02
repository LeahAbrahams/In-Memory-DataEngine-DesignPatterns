
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataOperations;
import java.util.List;

import models.Row;
/**
 *
 * @author ברכי
 */
public abstract class AbstractOperation {
    public abstract List<Row> run();
    public abstract void validate();
    public abstract  List<Row> execute();
}
