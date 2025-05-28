package AST;

import java.util.ArrayList;
import java.util.List;

public class COMPONENTDECLARATION1 extends ProgramAll{
 public List<ComponentMetadata> componentMetadata;

    public COMPONENTDECLARATION1(List<ComponentMetadata> componentMetadata) {
        this.componentMetadata = componentMetadata;
    }
public void addmeta(ComponentMetadata componentMetadata){
        this.componentMetadata.add(componentMetadata);
}

    public COMPONENTDECLARATION1() {
        this.componentMetadata = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Component {\n");
        for (ComponentMetadata metadata : componentMetadata) {
            sb.append("  ").append(metadata.toString()).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }
}
