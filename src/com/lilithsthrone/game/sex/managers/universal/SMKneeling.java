package com.lilithsthrone.game.sex.managers.universal;

import java.util.Map;

import com.lilithsthrone.game.character.GameCharacter;
import com.lilithsthrone.game.sex.SexPositionSlot;
import com.lilithsthrone.game.sex.SexPositionType;
import com.lilithsthrone.game.sex.managers.SexManagerDefault;

/**
 * @since 0.1.69
 * @version 0.1.97
 * @author Innoxia
 */
public class SMKneeling extends SexManagerDefault {

	public SMKneeling(Map<GameCharacter, SexPositionSlot> dominants, Map<GameCharacter, SexPositionSlot> submissives) {
		super(SexPositionType.KNEELING_ORAL,
				dominants,
				submissives);
	}

}
