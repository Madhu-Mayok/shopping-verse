package com.example.shoppingverse.dto.request;


        import com.example.shoppingverse.Enum.CardType;
        import jakarta.persistence.Column;
        import jakarta.persistence.EnumType;
        import jakarta.persistence.Enumerated;
        import lombok.*;
        import lombok.experimental.FieldDefaults;
        import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CardRequestDto {

    String customerMobile;

    String cardNo;

    int cvv;

    Date validTill;

    CardType cardType;
}