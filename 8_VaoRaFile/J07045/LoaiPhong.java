package J07045;

public class LoaiPhong implements Comparable<LoaiPhong>{
    private String type;
    private String name;
    private String money;
    private String fee;

    public LoaiPhong(String input) {
        String[] parts = input.split("\\s+");
        this.type = parts[0];
        this.name = parts[1];
        this.money = parts[2];
        this.fee = parts[3];
    }
    @Override
    public int compareTo(LoaiPhong o){
        int nameRoom=this.name.compareTo(o.name);
        return nameRoom;
    }
    @Override
    public String toString() {
        return type+" "+name+" "+money+" "+fee;
    }
}
