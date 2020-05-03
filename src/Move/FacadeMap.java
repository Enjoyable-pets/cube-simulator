package Move;

import Cube.Way;

import java.util.HashMap;
import java.util.Map;

public class FacadeMap {

    private Map<String, Facade> facades;
    private Map<String, String[]> mapping;

    public FacadeMap() {
        setupFacades();
        setupMapping();
    }

    public Facade getNext(int col, int row) {
        return getFacadeByWay(col, row, Way.NEXT);
    }

    public Facade getPrevious(int col, int row) {
        return getFacadeByWay(col, row, Way.PREV);
    }

    private Facade getFacadeByWay(int col, int row, int way) {
        String mapKey = createKey(col, row);
        String[] map = mapping.get(mapKey);
        String facadeKey = map[way];

        return facades.get(facadeKey);
    }

    private String createKey(int col, int row) {
        return String.valueOf(col) + row;
    }

    private void setupFacades() {
        facades = new HashMap<String, Facade>();
        facades.put("00", new Facade(0, 0));
        facades.put("01", new Facade(0, 1));
        facades.put("11", new Facade(1, 1));
        facades.put("10", new Facade(1, 0));
    }

    private void setupMapping() {
        int next = Way.NEXT;
        int prev = Way.PREV;

        mapping = new HashMap<>();
        String[] map = new String[2];

        map[next] = "01";
        map[prev] = "10";
        mapping.put("00", map);

        map[next] = "11";
        map[prev] = "00";
        mapping.put("01", map);

        map[next] = "10";
        map[prev] = "01";
        mapping.put("11", map);

        map[next] = "00";
        map[prev] = "11";
        mapping.put("10", map);
    }
}
