package day18.lombokEx;

public class ShopMain {

  public static void main(String[] args) {
    ShopDTO shop = new ShopDTO();
    ShopDTO shop1 = new ShopDTO("emart-강남","e-001","02-354-8888","emart-001","서울시 강남구 봉은사로112");
    System.out.println(shop.toString());
    ShopDTO shop2 = new ShopDTO("emart-강남","e-001","02-354-8888","emart-001","서울시 강남구 봉은사로112");
    System.out.println(shop1.toString());
    System.out.println(shop1);

    ShopDTO shop4 = ShopDTO.builder().shopName("emart-청담점").shopTele("02-4444-5555").build();
    System.out.println(shop4);
  }

}
