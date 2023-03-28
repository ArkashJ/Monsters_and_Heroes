package main.LoadData;

import java.util.List;

public interface Loadable<T> {
    List<T> loadFromFile(String filePath);
}
