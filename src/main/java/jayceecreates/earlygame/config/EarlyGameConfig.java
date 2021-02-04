package jayceecreates.earlygame.config;

import me.sargunvohra.mcmods.autoconfig1u.ConfigData;
import me.sargunvohra.mcmods.autoconfig1u.annotation.Config;
import me.sargunvohra.mcmods.autoconfig1u.annotation.ConfigEntry;

@Config(name = "earlygame")
public class EarlyGameConfig implements ConfigData {

    @ConfigEntry.Gui.Tooltip(count = 5)
    public boolean warningMessage = false;

    @ConfigEntry.Gui.Tooltip(count = 6)
    public boolean generateSticks = true;

    @ConfigEntry.Gui.Tooltip(count = 4)
    public boolean harderGroundBlocks = true;

    @ConfigEntry.Gui.Tooltip(count = 4)
    public double damageProbability = 2.5;

    @ConfigEntry.Gui.Tooltip(count = 4)
    public double flintConsumeProb = 0.3;

    @ConfigEntry.Gui.Tooltip(count = 4)
    public double flintSuccessProb = 0.7;

}
