package pe.universidad.caso.Dao;


import java.util.List;

public interface Todo<T> {
  int create (T t);
  int update (T t);
  int delete(int id);
  T read(int id);
  List<T> readAll();
  
}