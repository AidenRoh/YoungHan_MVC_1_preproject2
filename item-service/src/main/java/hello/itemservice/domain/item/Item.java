package hello.itemservice.domain.item;

import lombok.Getter;
import lombok.Setter;

// @Data를 사용하면 getter, setter, requiredArgsContructor,등등 다 만들어주는데, 이게 되게 위험하다고 함. 예상치 못한 버그가 자주 발생
@Getter @Setter
public class Item {

    private Long Id;
    private String itemName;
    private Integer price; // 가격이나 수량이 안들어 갈 수 있다는 가정으로 러퍼형으로 했음: null 값을 사용할 수 있으니까
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
