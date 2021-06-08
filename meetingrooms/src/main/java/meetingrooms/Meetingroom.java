package meetingrooms;

public class Meetingroom {

  private Long id;
  private String name;
  private int width;
  private int length;

    @Override
    public String toString() {
        return "Meetingroom{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", width=" + width +
                ", length=" + length +
                '}';
    }

    public Meetingroom(String name, int width, int length) {
        this.name = name;
        this.width = width;
        this.length = length;
    }

    public Meetingroom(Long id, String name, int width, int length) {
        this.id = id;
        this.name = name;
        this.width = width;
        this.length = length;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getArea() {
        return length*width;
    }
}
