package meetingrooms;

import java.util.List;

public interface MeetingroomsRepository {

    public void deleteAll();

    public void create(String name, int width, int length);

    public List<Meetingroom> listABC();

    public List<Meetingroom> reservedListABC();

    public List<String> evenList();

    public List<Integer> areaList();

    public List<String> search(String find);

    public List<String> partialSearch(String find);

    public List<Meetingroom> areaSearch(int area);
}
