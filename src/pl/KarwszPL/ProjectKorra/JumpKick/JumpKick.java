package pl.KarwszPL.ProjectKorra.JumpKick;

import com.projectkorra.projectkorra.ProjectKorra;
import com.projectkorra.projectkorra.ability.AddonAbility;
import com.projectkorra.projectkorra.ability.FireAbility;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class JumpKick extends FireAbility implements AddonAbility {


    public JumpKick(Player player) {
        super(player);
    }

    @Override
    public void progress() {





    }

    @Override
    public boolean isSneakAbility() {
        return true;
    }

    @Override
    public boolean isHarmlessAbility() {
        return false;
    }

    @Override
    public long getCooldown() {
        return 3000;
    }

    @Override
    public String getName() {
        return "JumpKick";
    }

    @Override
    public Location getLocation() {
        return null;
    }

    @Override
    public void load() {

        ProjectKorra.log.info(getName() + " v. " + getVersion() + " by " + getAuthor() + " successfully enabled!");
        Bukkit.getPluginManager().registerEvents(new JumpKickListener(), ProjectKorra.plugin);

    }

    @Override
    public void stop() {

    }

    @Override
    public String getAuthor() {
        return "KarwszPL";
    }

    @Override
    public String getVersion() {
        return "1.0";
    }
}
