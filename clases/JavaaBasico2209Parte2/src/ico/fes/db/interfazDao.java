/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ico.fes.db;

import java.util.ArrayList;
import org.sqlite.SQLiteException;


public interface interfazDao {
    public abstract ArrayList obtenerTodo() throws SQLiteException;
    public abstract boolean insertar(Object o) throws SQLiteException;
    public abstract boolean eliminar(String n) throws SQLiteException;

}
