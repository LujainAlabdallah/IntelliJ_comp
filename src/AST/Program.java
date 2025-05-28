package AST;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public List<ProgramAll> programAllList;

    public Program(List<ProgramAll> programAllList){
        this.programAllList = programAllList;
    }

    public Program() {
        this.programAllList= new ArrayList<>();
    }
public  void addall(ProgramAll all){
        programAllList.add(all);
}
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (ProgramAll item : programAllList) {
            sb.append(item.toString()).append("\n");
        }
        return sb.toString();
    }
}
