package BT1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class QLCB {
    private List<CanBo> canBos;
    public QLCB() {
        canBos = new ArrayList<CanBo>();
    }
    public void addCanBo(CanBo canBo) {
        canBos.add(canBo);
    }
    public List<CanBo> searchCanBo(String word) {
        return this.canBos.stream().filter(canBo -> canBo.getName().contains(word)).collect(Collectors.toList());
    }
    public void getAllCanBo(){
        this.canBos.forEach(canBo -> System.out.println(canBo.toString()));
    }
}
