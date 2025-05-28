package AST;

import java.util.ArrayList;
import java.util.List;

public class componentDeclaration extends ProgramAll{
    public List<ComponentMetadata> componentMetadata;

    public componentDeclaration(List<ComponentMetadata> componentMetadata) {
        this.componentMetadata = componentMetadata;
    }
    public void addmeta(ComponentMetadata componentMetadata){
        this.componentMetadata.add(componentMetadata);
    }

    public componentDeclaration() {
        this.componentMetadata = new ArrayList<>();
    }

    public List<ComponentMetadata> getComponentMetadata() {
        return componentMetadata;
    }

    public void setComponentMetadata(List<ComponentMetadata> componentMetadata) {
        this.componentMetadata = componentMetadata;
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
