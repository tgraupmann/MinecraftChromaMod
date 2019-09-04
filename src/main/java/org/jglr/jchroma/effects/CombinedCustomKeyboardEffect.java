package org.jglr.jchroma.effects;

import com.sun.jna.Structure;
import org.jglr.jchroma.utils.ColorRef;

public class CombinedCustomKeyboardEffect extends CustomKeyboardEffect {
    private final CustomKeyboardEffect firstEffect;
    private final CustomKeyboardEffect secondEffect;

    public CombinedCustomKeyboardEffect(CustomKeyboardEffect firstEffect, CustomKeyboardEffect secondEffect) {
        this.firstEffect = firstEffect;
        this.secondEffect = secondEffect;
    }

    @Override
    public Structure createParameter() {
        // combines the two effects
        for (int j = 0; j < COLUMN_COUNT; j++) {
            for (int i = 0; i < ROW_COUNT; i++) {
                ColorRef firstColor = firstEffect.getColor(i, j);
                ColorRef secondColor = secondEffect.getColor(i, j);

                ColorRef toSet = firstColor;
                if(firstColor.equals(ColorRef.NULL)) {
                    toSet = secondColor;
                }
                setColor(i, j, toSet);
            }
        }
        return super.createParameter();
    }

}
