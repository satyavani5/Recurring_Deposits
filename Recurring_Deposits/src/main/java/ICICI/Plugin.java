package ICICI;

import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;

/*
 * Recurring_Deposits java plugin
 */
public class Plugin extends JavaPlugin
{
  private static final Logger LOGGER=Logger.getLogger("Recurring_Deposits");

  public void onEnable()
  {
    LOGGER.info("Recurring_Deposits enabled");
  }

  public void onDisable()
  {
    LOGGER.info("Recurring_Deposits disabled");
  }
}
