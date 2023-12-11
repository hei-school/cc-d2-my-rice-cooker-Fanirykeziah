interface RiceCooker {
    powerOn: boolean;
    cooking: boolean;
    warmMode: boolean;
    steamMode: boolean;
    cookingTime: number;
    warmTime: number;
    steamTime: number;
    pluggedIn: boolean;
  }
  
  function plugIn(cooker: RiceCooker): void {
    cooker.pluggedIn = true;
    console.log('The rice cooker is plugged in.');
  }
  
  function unplug(cooker: RiceCooker): void {
    cooker.pluggedIn = false;
    cooker.powerOn = false;
    console.log('The rice cooker is unplugged.');
  }
  
  function powerOn(cooker: RiceCooker): void {
    if (cooker.pluggedIn) {
      cooker.powerOn = true;
      console.log('The rice cooker is turned on.');
    } else {
      console.log('Please plug in the rice cooker before turning it on.');
    }
  }
  
  function setCookingMode(cooker: RiceCooker, time: number): void {
    try {
      if (!cooker.powerOn) {
        throw new Error('The rice cooker must be turned on before setting the cooking mode.');
      }
  
      cooker.cooking = true;
      cooker.cookingTime = time;
      console.log(`The rice cooker is in automatic cooking mode for ${time} minutes.`);
    } catch (error) {
      console.log(error);
    }
  }
  
  function setWarmMode(cooker: RiceCooker, time: number): void {
    try {
      if (!cooker.powerOn) {
        throw new Error('The rice cooker must be turned on before setting the warm mode.');
      }
  
      cooker.warmMode = true;
      cooker.warmTime = time;
      console.log(`The rice cooker is in warm mode for ${time} minutes.`);
    } catch (error) {
      console.log(error);
    }
  }
  
  function setSteamMode(cooker: RiceCooker, time: number, steamLevel: number): void {
    try {
      if (!cooker.powerOn) {
        throw new Error('The rice cooker must be turned on before setting the steam cooking mode.');
      }
  
      cooker.steamMode = true;
      cooker.steamTime = time;
      console.log(`The rice cooker is in steam cooking mode at level ${steamLevel} for ${time} minutes.`);
    } catch (error) {
      console.log(error);
    }
  }
  
  function cancel(cooker: RiceCooker): void {
    cooker.cooking = false;
    cooker.warmMode = false;
    cooker.steamMode = false;
    cooker.cookingTime = 0;
    cooker.warmTime = 0;
    cooker.steamTime = 0;
    console.log('All operations have been canceled.');
  }
  
  const cooker: RiceCooker = {
    powerOn: false,
    cooking: false,
    warmMode: false,
    steamMode: false,
    cookingTime: 0,
    warmTime: 0,
    steamTime: 0,
    pluggedIn: false,
  };
  
  try {
    plugIn(cooker);
    powerOn(cooker);
    setCookingMode(cooker, 30);
    setWarmMode(cooker, 60);
    setSteamMode(cooker, 60, 200);
    cancel(cooker);
  } catch (error) {
    console.log(error);
  } finally {
    unplug(cooker);
  }