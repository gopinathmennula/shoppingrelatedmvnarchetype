package archetype.adapter.example;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;

@DataObject(generateConverter = true, publicConverter = false)
public class ExampleServiceAdapterOptions {

  private String address;

  public ExampleServiceAdapterOptions(JsonObject config) {
    ExampleServiceAdapterOptionsConverter.fromJson(config, this);
  }

  public String getAddress() {
    return address;
  }

  public ExampleServiceAdapterOptions setAddress(String address) {
    this.address = address;
    return this;
  }

  /**
   * Convert to JSON
   *
   * @return the JSON
   */
  public JsonObject toJson() {
    JsonObject json = new JsonObject();
    ExampleServiceAdapterOptionsConverter.toJson(this, json);
    return json;
  }
}