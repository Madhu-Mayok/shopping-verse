package com.example.shoppingverse.dto.response;

import com.example.shoppingverse.dto.response.ItemResponseDto;
import com.example.shoppingverse.model.Item;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class CartResponseDto {

    String customerName;

    int cartTotal;

    List<ItemResponseDto> items;
}